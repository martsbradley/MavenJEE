/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany;


import com.mycompany.commonsejb.Policy;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.Remote;

/**
 *
 * @author martin
 */
@Stateless
@Remote(MyInterface.class)
public class NewSessionBean implements MyInterface
{
    @EJB
    private Policy mPolicy;
    
    public String businessMethod(String sayIt) 
    {
        return "yea " + sayIt  + mPolicy.getState();
    }
}
