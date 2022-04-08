package PatikaCloneOdev.View;

import PatikaCloneOdev.Helper.Config;
import PatikaCloneOdev.Helper.Helper;
import PatikaCloneOdev.Model.Educator;
import PatikaCloneOdev.Model.User;

import javax.swing.*;

public class EducatorGUI extends JFrame{
    private JPanel wrapper;

    public EducatorGUI(){
        add(wrapper);
        setSize(400,500);
        setLocation(Helper.screenCenterPoint("x",getSize()),Helper.screenCenterPoint("y",getSize()));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle(Config.PROJECT_TITLE);
        setResizable(false);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        Helper.setLayout();
        User educator=new Educator();
        educator.setId(1);
        educator.setName("Deneme Deneme");
        educator.setType("educator");
        educator.setUname("deneme");
        EducatorGUI eduGUI=new EducatorGUI();



    }
}
