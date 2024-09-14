package com.codingshuttle.anuj.week1Introduction.IntroductionToSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DbService {

   /*
   comment kiya hain loose copling chek krne k liye
   is thera se ye tightly coupled hain.
   @Autowired
     private ProdDb db;
*/

    //DB interface ko for loose coupling
   /* @Autowired
    private DB db;
    the dependancies is inject hear with using field injection*/

    //now we inject dependancies with construction injection
    final private DB db;

    public DbService(DB db){
        this.db = db;
    }

    //ye kon sa hoga uske liye application.propertices main define krnegen.
    String getData(){
       return db.getData();
    }
}
