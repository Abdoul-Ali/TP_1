package metier;

import dao.IDao;

import dao.IDao;

public class MetierImpl implements IMetier {

    private IDao dao; // Couplage faible

    public MetierImpl(IDao dao) {
        this.dao = dao;

    }

    @Override
    public double calcul() {
        double d = dao.getDate();
        double res= d*13;
        return res;
    }


    public void setDao(IDao dao) {
        this.dao = dao;
    }

}
