package example.carsharingprototype;

import org.kie.api.runtime.process.WorkItemHandler;
import org.kie.api.runtime.process.WorkItem;
import org.kie.api.runtime.process.WorkItemManager;
import java.util.Map;
import java.util.HashMap;
 
public class RemoveCarHandler implements java.io.Serializable, WorkItemHandler {

    static final long serialVersionUID = 1L;

    public RemoveCarHandler() {}
    
    public void	abortWorkItem(WorkItem workItem, WorkItemManager manager) {}

    public void	executeWorkItem(WorkItem workItem, WorkItemManager manager) {
        example.carsharingprototype.Car car = (example.carsharingprototype.Car) workItem.getParameter("Car");
        example.carsharingprototype.CarDb.removeCar(car.getLicencePlate());
        Map<String,Object> results = new HashMap<String,Object>();
        results.put("Results", true);
        manager.completeWorkItem(workItem.getId(), results);
    }
}

