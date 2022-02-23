package ua.lviv.iot.firstLab;

public class Main {
    public static void main(String[] args) {
        ProjectorScreen projectorScreen1 = new ProjectorScreen();
        ProjectorScreen projectorScreen2 = new ProjectorScreen("Ungladum");
        ProjectorScreen projectorScreen3 = new ProjectorScreen("Spakov", 2600, 4200);
        System.out.println(projectorScreen1);
        System.out.println(projectorScreen2);
        System.out.println(projectorScreen3);
        System.out.println("Static - "+ ProjectorScreen.getProjector_name());
    }
}