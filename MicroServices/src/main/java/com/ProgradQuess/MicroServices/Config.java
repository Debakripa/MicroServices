package com.ProgradQuess.MicroServices;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("microservices")
public class Config
{
    Config()
    {

    }
    float num1,num2;
    //Getter method for num1
    public float getNum1() {
        return num1;
    }

    //Setter method for num2
    public void setNum1(float num1)
    {
        this.num1 = num1;
    }

    //Getter method for num1
    public float getNum2() {
        return num2;
    }

    //Setter method for num2

    public void setNum2(float num2) {
        this.num2 = num2;
    }

    public Config(float num1,float num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    public float max()
    {
        if (num1 >= num2)
        {
            return num1;
        }
        return num2;
    }
    public float min()
    {
        if (num1 <= num2)
        {
            return num1;
        }
        return num2;
    }
}
