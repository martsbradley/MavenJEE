/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.commonsejb;

import javax.ejb.Stateless;
import javax.ejb.Remote;

/**
 *
 * @author martin
 */
@Stateless
@Remote(Policy.class)
public class CreatePolicyBean implements Policy
{

    @Override
    public String getState()
    {        
        return "TX";
    }

    @Override
    public String getCompany() 
    {
        return "010";
    }

    @Override
    public String getLine() 
    {
        return "070";
    }
}
