package cn.itsource.aigou.util;

public class AjaxResult {
    private String msg="操作成功";
    private boolean Success=true;
    private Object object;

    public static AjaxResult me(){
        return new AjaxResult();
    }
    public String getMsg() {
        return msg;
    }

    public AjaxResult setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public boolean isSuccess() {
        return Success;
    }

    public AjaxResult setSuccess(boolean success) {
        Success = success;
        return this;
    }

    public Object getObject() {
        return object;
    }

    public AjaxResult setObject(Object object) {
        this.object = object;
        return this;
    }

    @Override
    public String toString() {
        return "AjaxResult{" +
                "msg='" + msg + '\'' +
                ", Success=" + Success +
                ", object=" + object +
                '}';
    }
}
