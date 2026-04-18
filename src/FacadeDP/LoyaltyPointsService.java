package FacadeDP;

import AdapterDP.*;

public class LoyaltyPointsService {
    public void addPoints(String accountId, int points) {
        System.out.println("Step 4: Adding Loyalty Points...");
        System.out.println("✔ " + points + " loyalty points added to account " + accountId);
    }
}
