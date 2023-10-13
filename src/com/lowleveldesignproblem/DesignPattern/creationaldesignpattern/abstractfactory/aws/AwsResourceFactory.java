package com.lowleveldesignproblem.DesignPattern.creationaldesignpattern.abstractfactory.aws;

import com.lowleveldesignproblem.DesignPattern.creationaldesignpattern.abstractfactory.Instance;
import com.lowleveldesignproblem.DesignPattern.creationaldesignpattern.abstractfactory.ResourceFactory;
import com.lowleveldesignproblem.DesignPattern.creationaldesignpattern.abstractfactory.Storage;

public class AwsResourceFactory implements ResourceFactory {
    @Override
    public Instance createInstance(Instance.Capacity capacity) {
        return new Ec2Instance(capacity);
    }

    @Override
    public Storage createStorage(int capMib) {
        return new S3Storage(capMib);
    }
}
