package io.github.mandar2812.dynaml.models.neuralnets

import breeze.linalg.{DenseVector, DenseMatrix}
import breeze.numerics.sigmoid
import io.github.mandar2812.dynaml.models.ParameterizedLearner

/**
 * Top level trait defining
 * the most important properties
 * of a neural network
 */
trait NeuralNetwork[G] extends
ParameterizedLearner[G, Int, List[DenseMatrix[Double]],
  DenseVector[Double], DenseVector[Double],
  (DenseVector[Double], DenseVector[Double])] {

  val inputDimensions: Int

  val outputDimensions: Int

  val hiddenLayers: Int

  val activations: List[(Double) => Double]

  val neuronCounts: List[Int]
}
