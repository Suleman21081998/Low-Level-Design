package com.lowleveldesignproblem.DesignPattern.creationaldesignpattern.abstractfactory.gcp;

import com.lowleveldesignproblem.DesignPattern.creationaldesignpattern.abstractfactory.Instance;
import com.lowleveldesignproblem.DesignPattern.creationaldesignpattern.abstractfactory.ResourceFactory;
import com.lowleveldesignproblem.DesignPattern.creationaldesignpattern.abstractfactory.Storage;

public class GoogleResourceFactory implements ResourceFactory {
    @Override
    public Instance createInstance(Instance.Capacity capacity) {
        return new GoogleComputeEngineInstance(capacity);
    }

    @Override
    public Storage createStorage(int capMib) {
        return new GoogleCloudStorage(capMib);
    }
}
