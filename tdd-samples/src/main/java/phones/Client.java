package phones;

import java.util.ArrayList;
import java.util.Collection;

public class Client {
    private Collection<Phone> phones = new ArrayList<Phone>();

    public void addPhone(Phone phone) {
        phones.add(phone);
    }

    public boolean hasMobile() {
        for(Phone phone : phones)
            if (phone.isMobile()) {
                return true;
            }
        return false;
    }
}
