package dao;

public class DaoImpl implements IDao{
    @Override
    public double getData() {
        System.out.println("version bd");
        double temp=Math.random()*40;
        return temp;
    }
}
