import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'category',
})
export class CategoryPipe implements PipeTransform {
  transform(value: string, ...args: unknown[]): unknown {
    switch (value.toLowerCase()) {
      case 'frontend':
        return 'code';
      case 'backend':
        return 'computer';
    }
    return 'code';
  }
}
