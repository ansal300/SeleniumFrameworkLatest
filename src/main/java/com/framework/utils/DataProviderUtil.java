package com.framework.utils;

import com.framework.testdata.TestData;
import io.github.sskorol.core.DataSupplier;
import io.github.sskorol.data.TestDataReader;
import io.github.sskorol.data.XlsxReader;
import one.util.streamex.StreamEx;

import java.lang.reflect.Method;

public class DataProviderUtil {

    @DataSupplier
    public StreamEx<TestData> getData(Method method) {
        return TestDataReader.use(XlsxReader.class).withTarget(TestData.class)
                .withSource("TestData.xlsx").read().
                filter(testname -> testname.testName.equals(method.getName()));
    }
}
