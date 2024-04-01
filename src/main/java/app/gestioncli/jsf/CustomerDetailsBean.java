/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.gestioncli.jsf;
import app.gestioncli.entity.Customer;
import app.gestioncli.entity.Discount;
import java.io.Serializable;
import jakarta.inject.Inject;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;
import java.util.List;
import services.CustomerManager;
import services.DiscountManager;

@Named
@ViewScoped
public class CustomerDetailsBean implements Serializable {
  private int idCustomer;
  private Customer customer;
  private List<Discount> discount;

  @Inject
  private CustomerManager customerManager;
  
  @Inject
  private DiscountManager discountManager;

  public int getIdCustomer() {
    return idCustomer;
  }

  public void setIdCustomer(int idCustomer) {
    this.idCustomer = idCustomer;
  }
    public Customer getCustomer() {
        return customer;
    }
    public List<Discount> getDiscounts() {
        return discountManager.getAllDiscounts();
    }

  public String update() {
    // Modifie la base de données.
    // Il faut affecter à customer (sera expliqué dans le cours).
    customer = customerManager.update(customer);
    return "customerList";
  }

  public void loadCustomer() {
    this.customer = customerManager.findById(idCustomer);
    this.discount = this.getDiscounts();
  }
}
