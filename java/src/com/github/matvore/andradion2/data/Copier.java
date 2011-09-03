/*
Copyright 2011 Matt DeVore

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package com.github.matvore.andradion2.data;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.Rectangle;

public interface Copier<T> {
  <U extends T> U copy(U x);

  Copier<Rectangle> FOR_RECTANGLE = new Copier<Rectangle>() {
    @Override
    public Rectangle copy(Rectangle x) {
      return (Rectangle)x.clone();
    }
  };

  Copier<Point> FOR_POINT = new Copier<Point>() {
    @Override
    public Point copy(Point x) {
      return (Point)x.clone();
    }
  };

  Copier<Dimension> FOR_DIMENSION = new Copier<Dimension>() {
    @Override
    public Dimension copy(Dimension x) {
      return (Dimension)x.clone();
    }
  };
}
