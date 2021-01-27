/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import database.KingBabershopDatabase;
import entity.Pelanggan;
import error.PelangganException;
import java.sql.SQLException;
import service.PelangganDao;
/**
 *
 * @author USER
 */
public class LatihanCRUDMYCDAO {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) throws SQLException, PelangganException{
        // TODO code application logic here
        PelangganDao dao = KingBabershopDatabase.getPelangganDao();
        Pelanggan pelanggan = dao.getPelanggan(1);
       
         dao.updatePelanggan(pelanggan);
        
    }
    
}
