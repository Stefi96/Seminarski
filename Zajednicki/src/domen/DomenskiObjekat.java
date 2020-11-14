package domen;

import java.io.Serializable;
import java.sql.ResultSet;
import java.util.List;

public interface DomenskiObjekat extends Serializable {
    public String vratiImeTabele();

    public String vratiPoljaZaInsert();

    public String vratiVrednostZaInsert();

    public List<DomenskiObjekat> vratiListuPoRS(ResultSet rs);

    public String vratiTabelaID();

    public String vratiPK();

    public void postaviVrednostPoRS(ResultSet rs);

    public String vratiVrednostZaPromenu();
    
    public String vratiJoin();
    
    public String vratiAlias();
    
    public String whereConn();
}
