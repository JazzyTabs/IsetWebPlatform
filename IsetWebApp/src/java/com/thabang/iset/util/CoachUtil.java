package com.thabang.iset.util;

import com.thabang.iset.data.Coachmentor;
import com.thabang.iset.dto.CoachmentorDTO;
import com.thabang.iset.dto.transfer.RequestDTO;
import com.thabang.iset.dto.transfer.ResponseDTO;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Mokomane MB
 */
@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
public class CoachUtil {
    @PersistenceContext
    EntityManager em;
    
    public ResponseDTO getCoachByClasss(Integer coachmentorID){
        ResponseDTO resp = new ResponseDTO();
        try{
            Query q = em.createNamedQuery("Coachmentor.findByCoachMentorID",Coachmentor.class);
            q.setParameter("CoachMentor", coachmentorID);
            List<Coachmentor> list = q.getResultList();
            List<CoachmentorDTO> dto = new ArrayList<>();
            
            for (Coachmentor lis: list){
                dto.add(new CoachmentorDTO(lis));                        
            }
            resp.setCoachmentor(dto);
        }catch(Exception e){        
        }  
    return resp;
    }
    

}
