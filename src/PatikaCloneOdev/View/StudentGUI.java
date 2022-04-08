package PatikaCloneOdev.View;

import PatikaCloneOdev.Helper.Config;
import PatikaCloneOdev.Helper.Helper;
import PatikaCloneOdev.Helper.Item;
import PatikaCloneOdev.Model.Operator;
import PatikaCloneOdev.Model.Patika;
import PatikaCloneOdev.Model.Student;
import PatikaCloneOdev.Model.User;

import javax.swing.*;

public class StudentGUI extends JFrame{
    private JPanel wrapper;
    private JComboBox cmb_course_user;
    private JComboBox cmb_course_patika;
    
    public StudentGUI(){
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
        User student=new Student();
        
        StudentGUI studentGUI=new StudentGUI();
    }
    
    public void loadPatikaCombo(){
        cmb_course_patika.removeAllItems();
        for(Patika obj : Patika.getList()){
            cmb_course_patika.addItem(new Item(obj.getId(), obj.getName()));
        }
    }

    public void loadEducatorCombo(){
        cmb_course_user.removeAllItems();
        for(User obj : User.getList()){
            if(obj.getType().equals("educator")){
                cmb_course_user.addItem(new Item(obj.getId(),obj.getName()));
            }
        }
    }
}
