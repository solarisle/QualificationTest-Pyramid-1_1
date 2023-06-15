package com.ncr.test.pyramid.solver.impl;

import com.ncr.test.pyramid.data.Pyramid;
import com.ncr.test.pyramid.solver.PyramidSolver;

/**
 * TASK: This is your 3rd task.
 * Please implement the class to satisfy the interface. *
 */
public class YourSolver implements PyramidSolver {

    @Override
    public long pyramidMaximumTotal(Pyramid pyramid) {
        //if there is only one row then return the only one data.
        if (pyramid.getRows() == 1)
          return pyramid.get(0,0);

        //copy raw data to prevent massive access from object
        int[][] localPyramid = pyramid.getData();
        int pyramidRows = pyramid.getRows();

        //copy the first row to our process media, which is same
        //lenght as the pyramid's depth
        int[] processRow = localPyramid[0];
        
        //calculate from leaves to root, that reduced the complexity
        //to only O(n). 
        for(int row=1; row < pyramidRows; row++){
            for(int column=0; column < pyramidRows-row; column++){
                if(processRow[column] + localPyramid[row][column] > processRow[column+1] + localPyramid[row][column])
                    processRow[column] = processRow[column] + localPyramid[row][column];
                else
                    processRow[column] = processRow[column+1] + localPyramid[row][column];
            }
        }

        return processRow[0];

        //throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
