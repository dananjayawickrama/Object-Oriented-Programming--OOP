/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Z_Lab_05_Abstract_classes_interfaces_Part_01;

/**
 *
 * @author Dananjaya
 */
class Cat extends Animal { 
    
    public Cat(String name)
    { 
        super(name); 
    
    } 
    
    
    public Cat() 
    { 
        System.out.println("Cat constructor called"); 
    
    } 
    
    
    public String speak()
    {
        return "Meow Meow";
    }

}