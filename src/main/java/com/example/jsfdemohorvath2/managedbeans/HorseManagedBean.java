package com.example.jsfdemohorvath2.managedbeans;

import com.example.jsfdemohorvath2.entity.Horse;

import javax.annotation.ManagedBean;
import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
//import javax.faces.view.ViewScoped;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
@ApplicationScoped
//@ViewScoped
public class HorseManagedBean {

    private List<Horse> horseList;
    private Horse selectedHorse;
    private Long id;
    private List<String> colorList;
    private List<Integer> legList;

    public HorseManagedBean(){
        horseList = new ArrayList<>();
        selectedHorse = new Horse();
        this.id = 0L;
        colorList = new ArrayList<>();
        colorList.add("Piros");
        colorList.add("Kék");
        colorList.add("Zöld");
        colorList.add("Sárga");
        legList = new ArrayList<>();
        legList.add(2);
        legList.add(3);
        legList.add(4);
        legList.add(5);
    }

    @PostConstruct
    private void init() {

        for (int i=0; i < 5; i++) {
            Horse horse = new Horse();
            //horse.setId(Long.parseLong(i + ""));
            horse.setId(idService());
            horse.setBrand("Sanyi" + (i+1));
            horse.setModel("Nyerges" + (i+1));
            horse.setColour("Barna");
            horse.setLegs(4);
            horse.setEngineCode("VOL-123456");
            horse.setTopSpeed(250);
            horse.setHorsepower(360);
            horseList.add(horse);
        }
    }

    public List<Horse> getHorseList() {
        return horseList;
    }

    public void setHorseList(List<Horse> horseList) {
        this.horseList = horseList;
    }

    public Horse getSelectedHorse(){
        return selectedHorse;
    }

    public void setSelectedHorse(Horse selectedHorse) {
        this.selectedHorse = selectedHorse;
    }

    private Long idService(){
        this.id++;
        return id;
    }

    public List<String> getColorList() {
        return colorList;
    }

    public void setColorList(List<String> colorList) {
        this.colorList = colorList;
    }


    //Az add művelethez szükséges, hogy az xhtml fájl elérje az ajtók száma lehetőséget.
    public List<Integer> getLegList() {
        return legList;
    }

    public void setLegList(List<Integer> legList) {
        this.legList = legList;
    }

    public void save(Horse horse) {
        if (horse.getId() == 0) {
            horse.setId(idService());
            horseList.add(horse);
            selectedHorse = new Horse();
        }
        else{
            delete(horse.getId());
            horseList.add(horse);
            selectedHorse = new Horse();
        }
    }

    public void delete(Long id) {
        for (Horse horse : horseList) {
            if (horse.getId() == id) {
                horseList.remove(horse);
                break;
            }
        }
    }

    public void findCar(Long id) {
        for (Horse horse : horseList) {
            if (horse.getId() == id) {
                selectedHorse = horse;
            }
        }
    }
}
