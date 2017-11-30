package strange.cypher.katyaar.Dagg;

import javax.inject.Inject;

/**
 * Created by pnmhatre on 11/21/2017.
 */

public class Television {
    Remote remote;

    @Inject
    public Television(Remote remote) {
        this.remote = remote;
    }

    public Remote getRemote() {
        return remote;
    }

    public void setRemote(Remote remote) {
        this.remote = remote;
    }

    public int getSum(int x) {
        return remote.getChannels() + x;
    }
}
