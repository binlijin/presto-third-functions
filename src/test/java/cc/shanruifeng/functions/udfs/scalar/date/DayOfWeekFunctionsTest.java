package cc.shanruifeng.functions.udfs.scalar.date;

import com.facebook.presto.metadata.FunctionListBuilder;
import com.facebook.presto.type.TypeRegistry;
import io.airlift.slice.Slices;
import junit.framework.Assert;
import org.junit.Test;

/**
 * @author ruifeng.shan
 * @date 2016-07-12
 * @time 14:44
 */
public class DayOfWeekFunctionsTest {

    @Test
    public void testFunctionCreate() throws Exception {
        TypeRegistry typeRegistry = new TypeRegistry();
        FunctionListBuilder builder = new FunctionListBuilder(typeRegistry);
        builder.scalar(DayOfWeekFunctions.class);
    }

    @Test
    public void testDayOfWeek() {
        long result = DayOfWeekFunctions.dayOfWeek(Slices.utf8Slice("2016-07-12"));
        Assert.assertEquals(2, result);
    }
}