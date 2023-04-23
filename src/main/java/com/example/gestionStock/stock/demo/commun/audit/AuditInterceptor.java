package com.example.gestionStock.stock.demo.commun.audit;

import com.example.gestionStock.stock.demo.entities.AuditableEntity;
import org.hibernate.EmptyInterceptor;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;

@Component
public class AuditInterceptor extends EmptyInterceptor {

    private static final long serialVersionUID = -8660756992502978437L;

    @Override
    public boolean onFlushDirty(Object entity, Serializable id, Object[] currentState, Object[] previousState, String[] propertyNames,
                                org.hibernate.type.Type[] types){

         if(entity instanceof AuditableEntity){
             setValue(currentState,propertyNames,"updatedBy", "user");
             setValue(currentState, propertyNames, "updatedOn", new Date());
         }
             return false;

    }

    @Override
    public boolean onSave(Object entity, Serializable id, Object[] state, String[] propertyNames, org.hibernate.type.Type[] types) {
        if (entity instanceof AuditableEntity) {
            setValue(state, propertyNames, "createdBy", "ayoub");
            setValue(state, propertyNames, "createdOn", new Date());
        }
            return false;

    }

    private void setValue(Object[] currentState, String[] propertyNames, String propertyToSet, Object value) {
        int index = Arrays.asList(propertyNames).indexOf(propertyToSet);
        if (index >= 0) {
            currentState[index] = value;
        }
    }
}
