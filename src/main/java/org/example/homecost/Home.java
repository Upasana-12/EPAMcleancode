package org.example.homecost;

public class Home
{
    String material_standard;
    double total_area_of_house;
    Boolean fully_automated;

   public Home(String material, double area, Boolean auto)
    {
        material_standard = material;
        total_area_of_house = area;
        fully_automated = auto;
    }

    public double totalCost()
    {
        double cost;
        if(material_standard.equalsIgnoreCase("sm"))
        {
            if(fully_automated)
            {
                cost = 1200+700;
            }
            else
            {
                cost = 1200;
            }
            return cost*total_area_of_house;
        }
        else if(material_standard.equalsIgnoreCase("asm"))
        {
            if(fully_automated)
            {
                cost = 1500+700;
            }
            else
            {
                cost = 1500;
            }
            return cost*total_area_of_house;
        }
        else if(material_standard.equalsIgnoreCase("hsm"))
        {
            if(fully_automated)
            {
                cost = 1800+700;
            }
            else
            {
                cost = 1800;
            }
            return cost*total_area_of_house;
        }
        else
        {
            return -1;
        }
    }

}
