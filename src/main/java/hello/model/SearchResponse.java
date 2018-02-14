package hello.model;

/**
 * Created by qzhao on 2018/2/14.
 */
public class SearchResponse {
    private int status;
    private String statusInfo;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getStatusInfo() {
        return statusInfo;
    }

    public void setStatusInfo(String statusInfo) {
        this.statusInfo = statusInfo;
    }
}
