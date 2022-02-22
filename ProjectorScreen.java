package ua.lviv.iot.firstLab;

record ProjectorScreen(String name, int height, int width,
                       String manufacturer, String attachmentType, String resolution) {
    public static final String projector_name = "Unknown";

    public ProjectorScreen() {
        this(projector_name);
    }

    public ProjectorScreen(String name){
        this(name, 1920);
    }

    public ProjectorScreen(String name, int height){
        this(name,height, 1080);
    }

    public ProjectorScreen(String name,int height, int width){
        this(name, height, width, "Chinese kids", "Wall", "4k");
    }

    @Override
    public String toString(){

        return "Projectors screen:\n" +
                "\tName -> " + name + "\n" +
                "\tHeight -> " + height + "\n" +
                "\tWidth -> " + width + "\n" +
                "\tManufacturer -> " + manufacturer + "\n" +
                "\tAttacment type -> " + attachmentType + "\n" +
                "\tResolution -> " + resolution + "\n";
    }

    public static String getProjector_name(){
        return projector_name;
    }
}
