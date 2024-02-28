import com.narender.abstractFactory.AbstractDoaFactory.AbstactDaoFactory;
import com.narender.abstractFactory.DAO.DAO;
import com.narender.abstractFactory.DoaMaker;

public class Test {

    public static void main(String[] args){
        AbstactDaoFactory xml = DoaMaker.getDao("db");
        DAO emp = xml.createDoa("Dept");
        emp.save();
/*

        AbstactDaoFactory db = DoaMaker.getDao("XML");
        db.createDoa("emp");
        db.createDoa("Dept");
*/


    }

}
