/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecttree;

/**
 *
 * @author USER
 */
import java.util.*;
public class Feeling {
private String NodeName;
LinkedList<String> feelling= new LinkedList<String>();

    public Feeling(String NodeName) {
        this.NodeName = NodeName;
    }
    public String getNodeName() {
        return NodeName;
    }

    public void setNodeName(String NodeName) {
        this.NodeName = NodeName;
    }

    public LinkedList<String> getFeelling() {
        return feelling;
    }

    public void setFeelling(LinkedList<String> feelling) {
        this.feelling = feelling;
    }

}
