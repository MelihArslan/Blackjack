import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TableroomComponent } from './tableroom.component';

describe('TableroomComponent', () => {
  let component: TableroomComponent;
  let fixture: ComponentFixture<TableroomComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ TableroomComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(TableroomComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
