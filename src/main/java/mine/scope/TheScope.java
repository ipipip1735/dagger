package mine.scope;

import javax.inject.Scope;
import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.CLASS;

/**
 * Created by Administrator on 2021/5/11.
 */
@Scope
@Retention(CLASS)
public @interface TheScope {}
