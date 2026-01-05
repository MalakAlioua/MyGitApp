package com.l3.gl.controller;

import com.l3.gl.model.Product;
import com.l3.gl.model.User;
import com.l3.gl.view.Ui;

public class Controller {

    public static void main(String[] args) {

        // Créer un utilisateur et un produit
        User user = new User("Alice", 25);
        Product product = new Product("Laptop", 999.99);

        // Afficher quelques infos dans la console
        System.out.println("User: " + user.getName() + ", age: " + user.getAge());
        System.out.println("Product: " + product.getName() + ", price: " + product.getPrice());

        // Créer et afficher l'interface graphique
        Ui ui = new Ui();
        ui.showUi();
    }
}
