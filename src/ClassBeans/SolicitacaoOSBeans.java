/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassBeans;

/**
 *
 * @author devops
 */
public class SolicitacaoOSBeans {
    private int id_solicitacao;
    private UsuariosBeans user_id;
    private DepartamentoBeans dep_id;
    private String info_cab;
    private String info_sol;
    private TipoUrgenciaBeans urg_id;
    private String data_sol;

    /**
     * @return the id_solicitacao
     */
    public int getId_solicitacao() {
        return id_solicitacao;
    }

    /**
     * @param id_solicitacao the id_solicitacao to set
     */
    public void setId_solicitacao(int id_solicitacao) {
        this.id_solicitacao = id_solicitacao;
    }

    /**
     * @return the user_id
     */
    public UsuariosBeans getUser_id() {
        return user_id;
    }

    /**
     * @param user_id the user_id to set
     */
    public void setUser_id(UsuariosBeans user_id) {
        this.user_id = user_id;
    }

    /**
     * @return the dep_id
     */
    public DepartamentoBeans getDep_id() {
        return dep_id;
    }

    /**
     * @param dep_id the dep_id to set
     */
    public void setDep_id(DepartamentoBeans dep_id) {
        this.dep_id = dep_id;
    }

    /**
     * @return the info_cab
     */
    public String getInfo_cab() {
        return info_cab;
    }

    /**
     * @param info_cab the info_cab to set
     */
    public void setInfo_cab(String info_cab) {
        this.info_cab = info_cab;
    }

    /**
     * @return the info_sol
     */
    public String getInfo_sol() {
        return info_sol;
    }

    /**
     * @param info_sol the info_sol to set
     */
    public void setInfo_sol(String info_sol) {
        this.info_sol = info_sol;
    }

    /**
     * @return the urg_id
     */
    public TipoUrgenciaBeans getUrg_id() {
        return urg_id;
    }

    /**
     * @param urg_id the urg_id to set
     */
    public void setUrg_id(TipoUrgenciaBeans urg_id) {
        this.urg_id = urg_id;
    }

    /**
     * @return the data_sol
     */
    public String getData_sol() {
        return data_sol;
    }

    /**
     * @param data_sol the data_sol to set
     */
    public void setData_sol(String data_sol) {
        this.data_sol = data_sol;
    }
    
    
}
