/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pkg.tuan5;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Controller {

    public static List<BookSupliers> getAllBoosBookSuplierses() {
        List<BookSupliers> listBooks = new ArrayList<>();
        Connection conn = null;
        String querry = "SELECT * FROM dbo.BookSupliers";
        Statement stBook;
        ResultSet rsBook;
        try {
            conn = DBConnections.getConnection();
            stBook = conn.createStatement();
            rsBook = stBook.executeQuery(querry);
            BookSupliers bookSupliers = null;
            while (rsBook.next()) {
                bookSupliers = new BookSupliers();
                bookSupliers.setId(rsBook.getString("id"));
                bookSupliers.setName(rsBook.getString("name"));
                bookSupliers.setType(rsBook.getString("type"));
                bookSupliers.setAddress(rsBook.getString("Address"));
                bookSupliers.setContract(rsBook.getString("contract"));
                bookSupliers.setEmail(rsBook.getString("email"));
                bookSupliers.setRemakes(rsBook.getString("remakes"));

                listBooks.add(bookSupliers);
            }
            conn.close();
            rsBook.close();
            stBook.close();
        } catch (SQLException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listBooks;
    }

    public static boolean addBooks(BookSupliers book) {
        Connection conn = null;
        String querry = "INSERT INTO BookSupliers (id, name, type, Address, contract, email, remakes)  VALUES (?, ?, ?, ?, ?, ?, ? )";
        try {
            conn = DBConnections.getConnection();
            PreparedStatement ps = conn.prepareStatement(querry);
            ps.setString(1, book.getId());
            ps.setString(2, book.getName());
            ps.setString(3, book.getType());
            ps.setString(4, book.getAddress());
            ps.setString(5, book.getContract());
            ps.setString(6, book.getEmail());
            ps.setString(7, book.getRemakes());
            return ps.executeUpdate() > 0;
        } catch (SQLException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public static void deleteBooks(String id) {
        Connection conn = null;
        String querry = "DELETE FROM BookSupliers WHERE id=" + id;
        PreparedStatement psBook = null;
        int rowDelete = 0;
        try {
            conn = DBConnections.getConnection();
            psBook = conn.prepareStatement(querry);
            rowDelete = psBook.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(jfrBookSupliers.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static boolean updateBooks(BookSupliers book , String id ) {
        Connection conn = null;
        String querry = "UPDATE BookSupliers SET name = ? , type = ? , Address = ? , contract = ? , email = ? , remakes = ? where id =  " + id;
        try {
            conn = DBConnections.getConnection();
            PreparedStatement ps = conn.prepareStatement(querry);

            ps.setString(1, book.getName());
            ps.setString(2, book.getType());
            ps.setString(3, book.getAddress());
            ps.setString(4, book.getContract());
            ps.setString(5, book.getEmail());
            ps.setString(6, book.getRemakes());
           // ps.setString(7, book.getId());
            return ps.executeUpdate() > 0;
        } catch (SQLException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

}
