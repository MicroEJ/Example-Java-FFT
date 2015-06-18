/*
 * Java
 *
 * Copyright 2015 IS2T. All rights reserved.
 * Use of this source code is governed by a BSD-style license that can be found at http://www.is2t.com/open-source-bsd-license/.
 */

package com.is2t.examples.numeric.fft;

import ej.numeric.ComplexDoubleMatrix;
import ej.numeric.DoubleMatrix;
import ej.numeric.signal.Transforms;

/**
 * This example compute a Fast Fourier Transform and it's inverse.
 */
public class FFTExample {

	public static void main(String[] args) {
		//Create three random matrices
		DoubleMatrix A = DoubleMatrix.rand(128, 1);
		ComplexDoubleMatrix B = ComplexDoubleMatrix.rand(128, 1);
		ComplexDoubleMatrix C = ComplexDoubleMatrix.rand(128, 1);
		System.out.println("===============   FFT Real matrix  ===============");
		System.out.println(Transforms.fft(A));
		System.out.println("===============   FFT Complex matrix  ===============");
		System.out.println(Transforms.fft(B));
		System.out.println("===============   IFFT complex matrix  ===============");
		System.out.println(Transforms.ifft(C));
	}
}
