package vhr2.util;

import org.springframework.security.core.context.SecurityContextHolder;

import vhr2.entity.Hr;

/**
 * Created by sang on 2017/12/30.
 */
public class HrUtils {
    public static Hr getCurrentHr() {
        return (Hr) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }
}
