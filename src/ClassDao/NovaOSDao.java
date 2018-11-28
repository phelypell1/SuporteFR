/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassDao;

import ClassBeans.SolicitacaoOSBeans;
import ConnectionClass.ConnectionFactor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author devops
 */
public class NovaOSDao {
    
    public void Cadastrar(SolicitacaoOSBeans solicitacao){
        Connection conn = ConnectionFactor.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = conn.prepareStatement("insert into solicitacaoOS (id_os, user_id, dep_id,inf_cab, inf_sol, data_sol,sts_id) values (?,?,?,?,?,default,?)");
            
        } catch (SQLException ex) {
            Logger.getLogger(NovaOSDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
    
}
