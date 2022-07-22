package Toyota.Warehouse;

import Toyota.Auto.*;

import java.util.Arrays;

public class Warehouse {

    private int carCount = 0;
    private int freeSpaceAmount = 1000;
    private Camry[] camries = new Camry[0];
    private Dyna[] dynas = new Dyna[0];
    private Hiance[] hiances = new Hiance[0];
    private Solara[] solaras = new Solara[0];

    public void addCamry(Camry camry) {
        Camry[] newCamries = new Camry[camries.length + 1];
        for (int i = 0; i < camries.length; i++) {
            newCamries[i] = camries[i];
        }
        camries = newCamries;
        this.camries[camries.length - 1] = camry;
        this.carCount++;
        this.freeSpaceAmount--;
    }

    public void addDyna(Dyna dyna) {
        Dyna[] newDynas = new Dyna[dynas.length + 1];
        for (int i = 0; i < dynas.length; i++) {
            newDynas[i] = dynas[i];
        }
        dynas = newDynas;
        this.dynas[dynas.length - 1] = dyna;
        this.carCount++;
        this.freeSpaceAmount--;
    }

    public void addHiance(Hiance hiance) {
        Hiance[] newHiances = new Hiance[hiances.length + 1];
        for (int i = 0; i < hiances.length; i++) {
            newHiances[i] = hiances[i];
        }
        hiances = newHiances;
        this.hiances[hiances.length - 1] = hiance;
        this.carCount++;
        this.freeSpaceAmount--;
    }

    public void addSolara(Solara solara) {
        Solara[] newSolaras = new Solara[solaras.length + 1];
        for (int i = 0; i < solaras.length; i++) {
            newSolaras[i] = solaras[i];
        }
        solaras = newSolaras;
        this.solaras[solaras.length - 1] = solara;
        this.carCount++;
        this.freeSpaceAmount--;
    }

    public Camry getCamry() {
        Camry camry = null;
        try {
            camry = camries[camries.length - 1];
            camries = Arrays.copyOf(camries, camries.length - 1);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Машин нет на складе");
        }
        return camry;
    }

    public Dyna getDyna() {
        Dyna dyna = null;
        try {
            dyna = dynas[dynas.length - 1];
            dynas = Arrays.copyOf(dynas, dynas.length - 1);
        } catch (IndexOutOfBoundsException | NullPointerException e) {
            System.out.println("Машин нет на складе");
        }
        return dyna;
    }

    public Hiance getHiance() {
        Hiance hiance = null;
        try {
            hiance = hiances[hiances.length - 1];
            hiances = Arrays.copyOf(hiances, hiances.length - 1);
        } catch (IndexOutOfBoundsException | NullPointerException e) {
            System.out.println("Машин нет на складе");
        }
        return hiance;
    }

    public Solara getSolara() {
        Solara solara = null;
        try {
            solara = solaras[solaras.length - 1];
            solaras = Arrays.copyOf(solaras, solaras.length - 1);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Машин нет на складе");
        }
        return solara;
    }

    public int getCamriesCount() {
        return camries.length;
    }

    public int getDynasCount() {
        return dynas.length;
    }

    public int getHiancesCount() {
        return hiances.length;
    }

    public int getSolarasCount() {
        return solaras.length;
    }
}
