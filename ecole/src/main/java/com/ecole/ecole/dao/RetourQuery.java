package com.ecole.ecole.dao;

public class RetourQuery {

    private Long count;

    private Long idNiveau;

    public RetourQuery(Long count, Long idNiveau) {
        this.count = count;
        this.idNiveau = idNiveau;
    }


    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public Long getIdNiveau() {
        return idNiveau;
    }

    public void setIdNiveau(Long idNiveau) {
        this.idNiveau = idNiveau;
    }
}
