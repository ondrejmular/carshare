package example.carsharingprototype;

import org.kie.api.runtime.process.WorkItemHandler;
import org.kie.api.runtime.process.WorkItem;
import org.kie.api.runtime.process.WorkItemManager;
import java.util.Map;
import java.util.HashMap;
 
public class CreateNewUserHandler implements java.io.Serializable, WorkItemHandler {

    static final long serialVersionUID = 1L;

    public CreateNewUserHandler() {}
    
    public void	abortWorkItem(WorkItem workItem, WorkItemManager manager) {}

    public void	executeWorkItem(WorkItem workItem, WorkItemManager manager) {
        example.carsharingprototype.User user = (example.carsharingprototype.User)workItem.getParameter("User");
        Map<String,Object> results = new HashMap<String,Object>();
        
        try {
            example.carsharingprototype.UserDb.createUser(user);
            results.put("Results", true);
        } catch (Exception ex) {
            results.put("Results", false);
        }
        
        manager.completeWorkItem(workItem.getId(), results);
    }
}