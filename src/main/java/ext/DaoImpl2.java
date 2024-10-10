package ext;

import dao.IDao;

public class DaoImpl2 implements IDao {


    @Override
    public double getDate() {
        System.out.println("Version 2");
        double d = 100;
        return d;
    }
}
