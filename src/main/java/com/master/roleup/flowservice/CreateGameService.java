
package com.master.roleup.flowservice;

import com.master.roleup.object.Game;
import java.io.Serializable;
import org.springframework.stereotype.Service;
import org.springframework.webflow.execution.RequestContext;

@Service
public class CreateGameService implements Serializable {
    
    public String justTest(Game game,RequestContext context){
        context.getFlowScope().put("game", game);
        return "success";
    }
}
