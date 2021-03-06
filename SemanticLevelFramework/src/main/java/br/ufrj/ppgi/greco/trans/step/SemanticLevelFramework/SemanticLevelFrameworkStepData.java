package br.ufrj.ppgi.greco.trans.step.SemanticLevelFramework;

import org.pentaho.di.core.row.RowMetaInterface;
import org.pentaho.di.trans.step.BaseStepData;
import org.pentaho.di.trans.step.StepDataInterface;

/**
 * Guarda dados usados durante processamento do step SemanticLevelFramework.
 * 
 * @author Camila Carvalho Ferreira
 * 
 */
public class SemanticLevelFrameworkStepData extends BaseStepData implements
        StepDataInterface
{
    public RowMetaInterface outputRowMeta;
}
