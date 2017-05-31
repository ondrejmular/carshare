package example.carsharingprototype;

import org.kie.api.runtime.process.WorkItemHandler;
import org.kie.api.runtime.process.WorkItem;
import org.kie.api.runtime.process.WorkItemManager;
import java.util.Map;
import java.util.HashMap;
 
public class VerifyUserHandler implements java.io.Serializable, WorkItemHandler {

    static final long serialVersionUID = 1L;

    public VerifyUserHandler() {}
    
    public void	abortWorkItem(WorkItem workItem, WorkItemManager manager) {}

    public void	executeWorkItem(WorkItem workItem, WorkItemManager manager) {
        example.carsharingprototype.User user = (example.carsharingprototype.User)workItem.getParameter("User");
        example.carsharingprototype.UserDb.verifyUser(user.getEmailAddress());
        Map<String,Object> results = new HashMap<String,Object>();
        results.put("Results", true);
        manager.completeWorkItem(workItem.getId(), results);
    }
}

