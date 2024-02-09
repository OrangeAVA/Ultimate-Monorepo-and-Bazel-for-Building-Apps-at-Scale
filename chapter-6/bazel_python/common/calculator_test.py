import unittest
from common.calculator import Calculator
 
class TestSum(unittest.TestCase):
 
  def test_sum(self):
    calculator = Calculator()
    self.assertEqual(calculator.add(1, 2), 3)
 
  if __name__ =="__main__":
    unittest.main()