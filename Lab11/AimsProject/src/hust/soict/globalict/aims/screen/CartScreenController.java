package hust.soict.globalict.aims.screen;

import javax.swing.JFrame;

import hust.soict.globalict.aims.cart.Cart;
import hust.soict.globalict.aims.exception.PlayerException;
import hust.soict.globalict.aims.media.*;
import hust.soict.globalict.aims.store.Store;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class CartScreenController {
	
	private Cart cart;
	private Store store;
	private JFrame jframe;
	
	@FXML
    private TableView<Media> tblMedia;
	@FXML
    private TableColumn<Media, String> colMediaTitle;
    @FXML
    private TableColumn<Media, String> colMediaCategory;
    @FXML
    private TableColumn<Media, Float> colMediaCost;
    
    @FXML
    private Button btnPlay;
    @FXML
    private Button btnRemove;
    
    @FXML
    private TextField tfFilter;
    @FXML
    private ToggleGroup filterCategory;
    @FXML
    private RadioButton radioBtnFilterId;
    @FXML
    private RadioButton radioBtnFilterTitle;
    
    @FXML
    private ToggleGroup sortGroup;
    
    @FXML
    private Label lbTotal;
    
    public CartScreenController(Cart cart, Store store, JFrame jframe) {
    	super();
    	this.cart = cart;
    	this.store = store;
    	this.jframe = jframe;
    }
    
    @FXML
    private void initialize() {
    	colMediaTitle.setCellValueFactory(new PropertyValueFactory<Media, String>("title"));
    	colMediaCategory.setCellValueFactory(new PropertyValueFactory<Media, String>("category"));
    	colMediaCost.setCellValueFactory(new PropertyValueFactory<Media, Float>("cost"));
    	tblMedia.setItems(this.cart.getItemsOrdered());
    	
    	lbTotal.setText(this.cart.totalCost() + "$");
    	btnPlay.setVisible(false);
    	btnRemove.setVisible(false);
    	
    	tblMedia.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Media>() {
    			
    			@Override
    			public void changed(ObservableValue<? extends Media> observable, Media oldValue, Media newValue) {
    				if(newValue!=null) {
    					updateButtonBar(newValue);
    				}
    			}
    	});
    	
    	
    	tfFilter.textProperty().addListener(new ChangeListener<String>() {
			@Override
			public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
				showFilteredMedia(newValue);
			}
    		
    	});
    }
    
    void updateButtonBar(Media media) {
    	btnRemove.setVisible(true);
    	if(media instanceof Playable) {
    		btnPlay.setVisible(true);
    	}
    	else btnPlay.setVisible(false);
    }
    
    void showFilteredMedia(String str) {
    	
    }
    
    @FXML
    void btnRemovePressed(ActionEvent event) {
    	Media media = tblMedia.getSelectionModel().getSelectedItem();
    	cart.removeMedia(media);
    	lbTotal.setText(cart.totalCost() + "$");
    }
    
    @FXML
    void btnPlaceOrderPressed(ActionEvent event) {
    	cart.emptyCart();
    	lbTotal.setText(cart.totalCost() + "$");
    }
    
    @FXML
    void btnPlayPressed(ActionEvent event) {
    	Media media = tblMedia.getSelectionModel().getSelectedItem();
    	try {
			((Playable) media).play();
		} catch (PlayerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    @FXML
    void btnLuckyItemPressed(ActionEvent event) {
    	cart.getFreeItem();
    	lbTotal.setText(cart.totalCost() + "$");
    }
    
    @FXML
    void radioBtnSortByCostSelected(ActionEvent event) {
    	cart.sortByCost();
    }

    @FXML
    void radioBtnSortByTitleSelected(ActionEvent event) {
    	cart.sortByTitle();
    }
    
    @FXML
    void addBookPressed(ActionEvent event) {
    	jframe.dispose();
    	new AddBookToStoreScreen(store,cart);
    }

    @FXML
    void addCDPressed(ActionEvent event) {
    	jframe.dispose();
        new AddCompactDiscToStoreScreen(store,cart);
    }

	@FXML
    void addDVDPressed(ActionEvent event) {
		jframe.dispose();
		new AddDigitalVideoDiscToStoreScreen(store,cart);
    }

    @FXML
    void viewStorePressed(ActionEvent event) {
    	jframe.dispose();
    	new StoreScreen(store, cart);
    }
}
