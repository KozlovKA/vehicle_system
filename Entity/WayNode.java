package Entity;

public class WayNode {
    private String nodeName;
    private String street;
    public WayNode(String nodeName,String street){
        this.nodeName=nodeName;
        this.street=street;
    }

    public String getNodeName() {
        return nodeName;
    }

    public String getStreet() {
        return street;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}

