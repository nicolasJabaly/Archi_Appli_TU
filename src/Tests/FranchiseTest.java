package Tests;

import Main.Franchise;
import org.junit.Test;

public class FranchiseTest {

    @Test
    public void franchiseOkCasX0Y0(){
        Franchise franchise = new Franchise(0,0);
        assert franchise.getChiffreDaffaire() == 0;
    }

    @Test
    public void franchiseOkCasX1Y0(){
        Franchise franchise = new Franchise(1,0);
        assert franchise.getChiffreDaffaire() == 0;
    }

    @Test
    public void franchiseOkCasX2Y0(){
        Franchise franchise = new Franchise(2,0);
        assert franchise.getChiffreDaffaire() == 0;
    }

    @Test
    public void franchiseOkCasX1000Y0(){
        Franchise franchise = new Franchise(1000,0);
        assert franchise.getChiffreDaffaire() == 0;
    }

    @Test
    public void franchiseOkCasX1Y1(){
        Franchise franchise = new Franchise(1,1);
        assert franchise.getChiffreDaffaire() == 1;
    }

    @Test
    public void franchiseOkCasX2Y1(){
        Franchise franchise = new Franchise(2,1);
        assert franchise.getChiffreDaffaire() == 2;
    }

    @Test
    public void franchiseOkCasX1000Y1(){
        Franchise franchise = new Franchise(1000,1);
        assert franchise.getChiffreDaffaire() == 1000;
    }

    @Test
    public void franchiseOkCasX2Y2(){
        Franchise franchise = new Franchise(2,2);
        assert franchise.getChiffreDaffaire() == 4;
    }

    @Test
    public void franchiseOkCasX1000Y2(){
        Franchise franchise = new Franchise(1000,2);
        assert franchise.getChiffreDaffaire() == 2000;
    }

    @Test
    public void franchiseOkCasX1000Y1000(){
        Franchise franchise = new Franchise(1000,1000);
        assert franchise.getChiffreDaffaire() == 1000000;
    }
}
