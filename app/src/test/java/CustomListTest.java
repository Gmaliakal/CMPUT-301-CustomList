
import static junit.framework.TestCase.assertEquals;

import com.example.simpleparadox.listycity.City;
import com.example.simpleparadox.listycity.CustomList;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;

    @Before
    public void createList(){
        list = new CustomList(null, new ArrayList<City>());

    }

    @Test
    public void addCityTest(){
        int listSize = list.getCount();
        list.addCity(new City("Halifax", "NS"));
        assertEquals(list.getCount(), listSize+1);

    }

    @Test
    public void hasCityTest(){
        assertEquals(0,list.hasCity(new City("Edmonton","AB")));
        list.addCity(new City("Edmonton","AB"));
        assertEquals(1,list.hasCity(new City("Edmonton","AB")));
    }


    @Test
    public void deleteTest(){
        list.addCity(new City("Edmonton","AB"));
        assertEquals(list.getCount(), 1);
        list.delete(new City("Edmonton","AB"));
        assertEquals(list.getCount(), 0);
        
    }

}

